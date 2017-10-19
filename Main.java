/**
 * Created by simone.venturin on 19/10/2017.
 */


import java.util.Arrays;

public class Main {

    /**
     Hash = digital signature
     Each block will have:
     List of transactions
     Previous Hash
     Hash
     */

    public static void main(String[] args) {

        String[] transactions0 = {"a satoshi sent ivan 999900 bitcoin","hal finney sent 10 bitcoins to ivan"};
        Block block0 = new Block(0, transactions0);

        String[] transactions1 = {"ivan sent 10 bitcoin to satoshi", "satoshi sent 10 bitcoin to starbuck"};
        Block block1 = new Block(block0.getBlockHash(), transactions1);

        String[] transactions2 = {"ivan sent 999 bitcoin to my mom"};
        Block block2 = new Block(block1.getBlockHash(), transactions2);

        System.out.println("Hash of block 0: " + block0.getBlockHash());
        System.out.println("Hash of block 1: " + block1.getBlockHash());
        System.out.println("Hash of block 2: " + block2.getBlockHash());

    }


}