package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * 경주 게임에 참여하는 자동차
 */
public class RacingCar {

    private String name;
    private int moveResult;

    public RacingCar(String name) {
        this.name = name;
    }

    public RacingCar(String name, int moveResult) {
        this.name = name;
        this.moveResult = moveResult;
    }

    public String getName() {
        return name;
    }

    public int getMoveResult() {
        return moveResult;
    }

    /**
     * 랜덤값을 구해서 임계치 이상이면 전진, 아니면 이동하지 않는다.
     */
    public void move() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum >= GameDetail.MOVE_THRESHOLD) {
            moveResult++;
        }
    }

    /**
     * 이동 결과를 출력한다.
     */
    public void printResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" : ");
        sb.append(convertToStringMoveResult());
        System.out.println(sb);
    }

    /**
     * 이동 결과를 문자열로 반환한다.
     * @return
     */
    public String convertToStringMoveResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moveResult; i++) {
            sb.append(GameDetail.MOVE_MARK);
        }
        return sb.toString();
    }

}
