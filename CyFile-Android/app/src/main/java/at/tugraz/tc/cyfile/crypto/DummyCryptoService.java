package at.tugraz.tc.cyfile.crypto;

/**
 * Dummy implementation of {@link CryptoService}
 * Created by cobri on 3/21/2018.
 */

public class DummyCryptoService implements CryptoService {
    @Override
    public byte[] encrypt(byte[] data) {
        return new byte[0];
    }

    @Override
    public byte[] decrypt(byte[] cipherData) {
        return new byte[0];
    }

    @Override
    public String encrypt(String data) {
        return null;
    }

    @Override
    public String decrypt(String cipherData) {
        return null;
    }
}
