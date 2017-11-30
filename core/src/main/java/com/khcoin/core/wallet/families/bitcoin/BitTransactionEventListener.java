package com.khcoin.core.wallet.families.bitcoin;

import com.khcoin.core.network.AddressStatus;
import com.khcoin.core.network.ServerClient.UnspentTx;
import com.khcoin.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
