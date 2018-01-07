package io.nlsltz.demos.BlockchainExample;

import java.util.Arrays;

public class Main {
    /**
        Blockchain Example
        Not decentralized, therefor no consensus algorithm implemented
        (c) Nils Lutz 2018
     */

    public static void main(String[] args) {
        
        /* Create Initial Blockchain */
        Blockchain demoBlockchain = new Blockchain();
        demoBlockchain.init();
        

        /* Add Block 1 and display the chain*/
        ArrayList<String> blockData = new ArrayList<>(demoBlockchain.getBlockSize());
        blockData.add("{"
            + "Type: 'Balances',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Bob: '400',"
            + "Alice: '0',"
            + "Max: '0',"
            + "Bob2: '0',"
            + "Timestamp: '1234567890'"
        + "}");
        Block block_1 = new Block(demoBlockchain.getActualBlock().getBlockhash(), blockData);

        demoBlockchain.add(block_1);
        demoBlockchain.displayBlocks();


        /* Add Block 2 and display the chain*/
        ArrayList<String> blockData2 = new ArrayList<>(demoBlockchain.getBlockSize());
        blockData.add("{"
            + "Type: 'Transaction',"
            + "Account: 'Bob',"
            + "Recepient: 'Alice',"
            + "Amount: '100.00',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Timestamp: '1234567890'"
        + "}");
        blockData.add("{"
            + "Type: 'Transaction',"
            + "Account: 'Bob',"
            + "Recepient: 'Max',"
            + "Amount: '100.00',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Timestamp: '1234567890'"
        + "}");
        blockData.add("{"
            + "Type: 'Transaction',"
            + "Account: 'Bob',"
            + "Recepient: 'Bob2',"
            + "Amount: '100.00',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Timestamp: '1234567890'"
        + "}");
        Block block_2 = new Block(demoBlockchain.getActualBlock().getBlockhash(), blockData2);

        demoBlockchain.add(block_2);
        demoBlockchain.displayBlocks();


        /* Add Block 3 and display the chain */
        ArrayList<String> blockData3 = new ArrayList<>(demoBlockchain.getBlockSize());
        blockData.add("{"
            + "Type: 'Transaction',"
            + "Account: 'Bob',"
            + "Recepient: 'Alice',"
            + "Amount: '100.00',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Timestamp: '1234567890'"
        + "}");
        blockData.add("{"
            + "Type: 'Transaction',"
            + "Account: 'Bob',"
            + "Recepient: 'Max',"
            + "Amount: '100.00',"
            + "Currency: 'Bitcoin',"
            + "CurrencyCode: 'BTC',"
            + "Timestamp: '1234567890'"
        + "}");
        Block block_3 = new Block(demoBlockchain.getActualBlock().getBlockhash(), blockData3);

        demoBlockchain.add(block_3);
        demoBlockchain.displayBlocks();
    }
}