package ss.week5;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 * A simple class that experiments with the Hex encoding
 * of the Apache Commons Codec library.
 *
 */
public class EncodingTest {
    public static void main(String[] args) throws DecoderException {
        String input = "Hello Big World"; //output becomes longer and different (in the middle)

        System.out.println(Hex.encodeHexString(input.getBytes()));
        
        
        String encoded = "4d6f64756c652032";
        char[] bytes = encoded.toCharArray();
        byte[] characters = Hex.decodeHex(bytes);
        String decoded = new String(characters);
        System.out.println(decoded);
        
        
        
       
        input = "Hello World";
        System.out.println(Base64.encodeBase64String(input.getBytes()));
        
        encoded = "010203040506";
        byte[] array = encoded.getBytes();
        System.out.println(Base64.encodeBase64String(array));
        //base64 is more efficient than hex (uses less characters)
        
        encoded = "U29mdHdhcmUgU31zdGVtcw==";
        characters = encoded.getBytes();
        characters = Base64.decodeBase64(encoded);
        decoded = new String(characters);
        System.out.println(decoded);
        
        
        String a = "a";
        String aa = "aa";
        String aaa = "aaa";
        String aaaa = "aaaa";
        String aaaaa = "aaaaa";
        String aaaaaa = "aaaaaa";
        System.out.println(Base64.encodeBase64String(a.getBytes()));
        System.out.println(Base64.encodeBase64String(aa.getBytes()));
        System.out.println(Base64.encodeBase64String(aaa.getBytes()));
        System.out.println(Base64.encodeBase64String(aaaa.getBytes()));
        System.out.println(Base64.encodeBase64String(aaaaa.getBytes()));
        System.out.println(Base64.encodeBase64String(aaaaaa.getBytes()));
        //decodes per 4 characters.
        
        
    }
}
