package com.widecash.core.coins.families;

import com.widecash.core.coins.CoinType;
import com.widecash.core.exceptions.AddressMalformedException;
import com.widecash.core.wallet.families.bitcoin.BitAddress;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
