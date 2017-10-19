import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by simone.venturin on 19/10/2017.
 */
public class Block {

    private int previousHash;
    private String[] transactions;

    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        
				// Questo è un oggetto contenitore che unisce l'hash del blocco precedente con le transazioni di questo blocco
        Object[] contens = {previousHash, Arrays.hashCode(transactions)};
        
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
