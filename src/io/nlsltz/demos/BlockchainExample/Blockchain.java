package io.nlsltz.demos.BlockchainExample;

public class Blockchain {
    /* Blochcain parameters and configuration */
    private final int blockSize = 5;
    private ArrayList<Block> blockchain;

    /* Additions for cryptocurrency
    private final int maxSupply = 1000;
    private int totalSupply = 0;
    private final int decimalPlaces = 18;
    */

    /**
     * Constructor
     */
    public Blockchain() {
        this.blockchain = new ArrayList<Block>();
    }

    /**
     * Initializes the blockchain
     * 
     * @return Block returns the last block in the chain, here genesis block
     */
    public Block init() {
        ArrayList<String> blockData = new ArrayList<>(blockSize);
        Block genesisBlock = new Block(0, blockData);

        this.blockchain.add(genesis);

        return this.blockchain.get(this.blockchain.size() - 1);
    }

    /**
     * Adds a block to the chain
     * 
     * @param newBlock the Block which is to be added to the chain
     * 
     * @return Block returns the last block in the chain, here genesis block
     */
    public Block addBlock(Block newBlock) {
        /* Check previousHash if valid add new block */
        Block actualBlock = this.blockchain.get(this.blockchain.size() - 1);
        if (newBlock.getPreviousBlockhash() == actualBlock.getBlockHash()) {
            this.blockchain.add(newBlock);
        } else {
            /* reject Block and Logging */
        }
    }

    /**
     * Displays the current chain state
     */
    public void displayBlocks() {
        System.out.println("Display current blockchain state...");
        System.out.println("(Simple printing block by block to stdout)");
        for (Block block : this.blockchain) {
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