package com.khcoin.core.coins;

import com.khcoin.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class KhcoinMain extends BitFamily {
    private KhcoinMain() {
        id = "khcoin.main";

        addressHeader = 48;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        name = "KHcoin";
        symbol = "KHC";
        uriScheme = "khcoin";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 KHC mininput
        softDustLimit = value(100000); // 0.001 KHC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("KHcoin Signed Message:\n");
    }

    private static KhcoinMain instance = new KhcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
