package com.widecash.core.coins.families;

import com.widecash.core.coins.CoinType;
import com.widecash.core.exceptions.AddressMalformedException;
import com.widecash.core.messages.MessageFactory;
import com.widecash.core.wallet.AbstractAddress;
import com.widecash.core.wallet.families.nxt.NxtAddress;
import com.widecash.core.wallet.families.nxt.NxtTxMessage;

import javax.annotation.Nullable;


/**
 * @author John L. Jegutanis
 *
 * Coins that belong to this family are: NXT, Burst, etc
 */
public abstract class NxtFamily extends CoinType {
    public static final short DEFAULT_DEADLINE = 1440;

    {
        family = Families.NXT;
    }

    @Override
    public AbstractAddress newAddress(String addressStr) throws AddressMalformedException {
        return NxtAddress.fromString(this, addressStr);
    }

    @Override
    public boolean canHandleMessages() {
        return true;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return NxtTxMessage.getFactory();
    }
}