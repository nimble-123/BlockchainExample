package io.nlsltz.demos.BlockchainExample;

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
        Block genesisBlock = new Block(0, blockData);

        this.blockChain.add(genesis);

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
        System.out.println("Display current blockChain state...");
        System.out.println("(Simple printing block by block to stdout)");
        
        for (Block block : this.blockChain) {
            System.out.println("Blockhash: %s", block.getBlockHash());
            System.out.println("Previous Blockhash: %s", block.getPreviousBlockhash());
            System.out.println("Blockdata: ");
            for (String item : block.getBlockData()) {
                System.out.println("|-Item: %s", item);
            }
        }
    }
    
    /**
     * Returns the defined block size
     */
    public int getBlockSize() {
        return blockSize;
    }
}