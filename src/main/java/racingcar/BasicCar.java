package racingcar;

import racingcar.interfaces.Car;
import racingcar.interfaces.MoveScoreMaker;

/**
 * @author sangsik.kim
 */
public class BasicCar implements Car {
    private final static Integer MOVE_CRITERIA = 4;
    private final static Integer INITIAL_POSITION = 0;
    private Integer position;
    private String name;

    public BasicCar(String name) {
        this.name = name;
        initialize();
    }

    @Override
    public void initialize() {
        this.position = INITIAL_POSITION;
    }

    @Override
    public void move(MoveScoreMaker moveScoreMaker) {
        if (canMove(moveScoreMaker.generate())) {
            moveForward();
        }
    }

    @Override
    public Integer getCurrentPosition() {
        return this.position;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private Boolean canMove(Integer score) {
        return score >= MOVE_CRITERIA;
    }

    private void moveForward() {
        this.position++;
    }
}
