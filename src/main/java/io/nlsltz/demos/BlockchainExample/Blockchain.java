package io.nlsltz.demos.BlockchainExample;

import java.util.ArrayList;
import java.util.Date;

public class Blockchain {
    /* Blochcain parameters and configuration */
    private final int blockSize = 5;
    private ArrayList<Block> blockChain;

    /* Additions for cryptocurrency
    private final int maxSupply = 1000;
    private int totalSupply = 0;
    private final int decimalPlaces = 18;
    */

    /**
     * Constructor
     */
    public Blockchain() {
        this.blockChain = new ArrayList<Block>();
    }

    /**
     * Initializes the blockChain
     * 
     * @return returns the last block in the chain, here genesis block
     */
    public Block init() {
        ArrayList<String> blockData = new ArrayList<>(blockSize);
        blockData.add("{"
            + "'Type: 'Balances',"
            + "'Currency': 'Bitcoin',"
            + "'CurrencyCode': 'BTC',"
            + "'Timestamp': '1234567890'"
        + "}");
        Block genesisBlock = new Block(0, blockData);

        this.blockChain.add(genesisBlock);

        return this.blockChain.get(this.blockChain.size() - 1);
    }

    /**
     * Adds a block to the chain
     * 
     * @param newBlock Block which is to be added to the chain
     * 
     * @return the last block in the chain, here genesis block
     */
    public Block addBlock(Block newBlock) {
        /* Check previousHash if valid add new block */
        Block actualBlock = this.blockChain.get(this.blockChain.size() - 1);
        
        if (newBlock.getPreviousBlockhash() == actualBlock.getBlockHash()) {
            this.blockChain.add(newBlock);
            return this.blockChain.get(this.blockChain.size() - 1);
        } else {
            /* reject Block and Logging */
            return this.blockChain.get(this.blockChain.size() - 1);
        }
    }

    /**
     * Displays the current chain state
     */
    public void displayBlocks() {
    	System.out.println(new Date() + " **********************************");
        
    	System.out.println("Display current blockChain state...");
        System.out.println("(Simple printing block by block to stdout)\n");
        
        for (Block block : this.blockChain) {
        	System.out.printf("Previous Blockhash: %d\n", block.getPreviousBlockhash());
            System.out.printf("Blockhash: %d\n", block.getBlockHash());
            System.out.println("Blockdata start ");
            for (String item : block.getBlockData()) {
                System.out.printf("-Item: %s\n", item);
            }
            System.out.println("Blockdata end \n\n");
        }
        System.out.println("***************************************************************");
        System.out.println();
    }
    
    /**
     * Returns the defined block size
     */
    public int getBlockSize() {
        return blockSize;
    }

	public Block getActualBlock() {
		return this.blockChain.get(this.blockChain.size() - 1);
	}
}