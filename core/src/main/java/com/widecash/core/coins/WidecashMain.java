package com.widecash.core.coins;

import com.widecash.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class WidecashMain extends BitFamily {
    private WidecashMain() {
        id = "Widecash.main";

        addressHeader = 73;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        name = "widecash";
        symbol = "WCH";
        uriScheme = "widecash";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 KHC mininput
        softDustLimit = value(100000); // 0.001 KHC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("widecash Signed Message:\n");
    }

    private static WidecashMain instance = new WidecashMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
