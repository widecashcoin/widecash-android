package com.widecash.core.wallet.families.bitcoin;

import com.widecash.core.network.AddressStatus;
import com.widecash.core.network.ServerClient.UnspentTx;
import com.widecash.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
