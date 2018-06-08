package test;

import de.re.eeip.EEIPClient;
import de.re.eeip.cip.exception.CIPException;

import java.io.IOException;
import java.util.Arrays;

public class TestClient {

    public static void main(String args[]) throws IOException, CIPException {
        EEIPClient client2 = new EEIPClient();
        client2.RegisterSession("10.8.0.41", 12352);
        byte[] bytes_2 = client2.GetAttributeSingle(0x321, 1, 1);
        System.out.println(Arrays.toString(bytes_2));
//
        EEIPClient client3 = new EEIPClient();
        client3.RegisterSession("10.8.0.41", 12352);
        byte[] bytes_3 = client3.GetAttributeSingle(0x01, 1, 1);
        System.out.println(Arrays.toString(bytes_3));
    }

}
