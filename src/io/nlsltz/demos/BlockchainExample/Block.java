package io.nlsltz.demos.BlockchainExample;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nlsltz.
 */
public class Block {

    private int previousBlockhash;
    private ArrayList<String> blockData;

    public Block(int previousBlockhash, ArrayList<String> blockData) {
        this.blockData = blockData;
        this.previousBlockhash = previousBlockhash;

        /* Logging - Block created */
    }

    public int getBlockHash() {
        return hashCode();
    }

    public int getPreviousBlockhash() {
        return previousBlockhash;
    }

    public ArrayList<String> getBlockData() {
        return blockData;
    }

}