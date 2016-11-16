package kg.ksucta.services;

/**
 * Created by Aibek on 12.11.2016.
 */
public interface IOService {

    void write(String message);

    String scan(String message);

    Integer scanInt(String message);
}
