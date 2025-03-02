package lotto.utils;

import static lotto.message.UtilNumber.LOTTO_COST;

public class Parser {
    public static int parseStringToInt(String stringValue) {
        return Integer.parseInt(stringValue);
    }

    public static int parsePaymentToCoin(int payment) {
        return payment / LOTTO_COST.getNumber();
    }
}