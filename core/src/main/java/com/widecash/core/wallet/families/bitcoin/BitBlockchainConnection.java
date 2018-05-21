package com.widecash.core.wallet.families.bitcoin;

import com.widecash.core.network.AddressStatus;
import com.widecash.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
