package io.nlsltz.demos.BlockchainExample;

import java.util.ArrayList;

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
            + "'Type: 'Balances',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Bob': '400',"
            + "'Alice': '0',"
            + "'Max': '0',"
            + "'Bob2': '0',"
            + "'Timestamp': '1234567890'"
        + "}");
        Block block_1 = new Block(demoBlockchain.getActualBlock().getBlockHash(), blockData);

        demoBlockchain.addBlock(block_1);
        demoBlockchain.displayBlocks();


        /* Add Block 2 and display the chain*/
        ArrayList<String> blockData2 = new ArrayList<>(demoBlockchain.getBlockSize());
        blockData2.add("{"
            + "'Type': 'Transaction',"
            + "'Account': 'Bob',"
            + "'Recepient': 'Alice',"
            + "'Amount': '100.00',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        blockData2.add("{"
            + "'Type': 'Transaction',"
            + "'Account': 'Bob',"
            + "'Recepient': 'Max',"
            + "'Amount': '100.00',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        blockData2.add("{"
            + "'Type': 'Transaction',"
            + "'Account': 'Bob',"
            + "'Recepient': 'Bob2',"
            + "'Amount': '100.00',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        blockData2.add("{"
    		+ "'Type: 'Balances',"
    		+ "'Currency': 'Bitcoin',"
    		+ "'CurrencyCode': 'BTC',"
    		+ "'Bob': '100',"
    		+ "'Alice': '100',"
    		+ "'Max': '100',"
    		+ "'Bob2': '100',"
    		+ "'Timestamp': '1234567890'"
		+ "}");
        Block block_2 = new Block(demoBlockchain.getActualBlock().getBlockHash(), blockData2);

        demoBlockchain.addBlock(block_2);
        demoBlockchain.displayBlocks();


        /* Add Block 3 and display the chain */
        ArrayList<String> blockData3 = new ArrayList<>(demoBlockchain.getBlockSize());
        blockData3.add("{"
            + "'Type': 'Transaction',"
            + "'Account': 'Alice',"
            + "'Recepient': 'Bob',"
            + "'Amount': '50.00',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        blockData3.add("{"
            + "'Type': 'Transaction',"
            + "'Account': 'Max',"
            + "'Recepient': 'Alice',"
            + "'Amount': '30.00',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        blockData3.add("{"
    		+ "'Type: 'Balances',"
    		+ "'Currency': 'Bitcoin',"
    		+ "'CurrencyCode': 'BTC',"
    		+ "'Bob': '150',"
    		+ "'Alice': '80',"
    		+ "'Max': '70',"
    		+ "'Bob2': '100',"
    		+ "'Timestamp': '1234567890'"
		+ "}");
        Block block_3 = new Block(demoBlockchain.getActualBlock().getBlockHash(), blockData3);

        demoBlockchain.addBlock(block_3);
        demoBlockchain.displayBlocks();
    }
}