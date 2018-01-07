package io.nlsltz.demos.BlockchainExample;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nlsltz.
 */
public class Block {

    private int previousBlockhash;
    private ArrayList<String> blockData;

    /**
     * Constructor
     *
     * @param previousBlockhash the hash of the previous block
     * @param blockData the data to be inserted in this block 
     */
    public Block(int previousBlockhash, ArrayList<String> blockData) {
        this.previousBlockhash = previousBlockhash;
        this.blockData = blockData;

        /* Logging - Block created */
    }

    /**
     * Returns the hash of the block
     *
     * @return the hash of the block represented as integer
     */
    public int getBlockHash() {
        return hashCode();
    }

    /**
     * Returns the hash of the previous block
     *
     * @return the hash of the previous block represented as integer
     */
    public int getPreviousBlockhash() {
        return previousBlockhash;
    }

    /**
     * Returns the data of the block
     *
     * @return the data of the block represented as a list of Strings
     */
    public ArrayList<String> getBlockData() {
        return blockData;
    }

}