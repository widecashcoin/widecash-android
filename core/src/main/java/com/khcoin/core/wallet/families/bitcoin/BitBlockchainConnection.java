package com.khcoin.core.wallet.families.bitcoin;

import com.khcoin.core.network.AddressStatus;
import com.khcoin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
