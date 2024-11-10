package DTO;

import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

    public String getUserName() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/workspace/Projects/Spotify/src/main/java/DTO/user/userDTO.csv"));
        String line = "";
        String splitBy = ",";
        String userName = null;
        while ((line = br.readLine()) != null) {
            String[] userData = line.split(splitBy);
            userName = userData[0];
        }
        return userName;
    }

    public String getUserPass() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/workspace/Projects/Spotify/src/main/java/DTO/user/userDTO.csv"));
        String line = "";
        String splitBy = ",";
        String userPass = null;
        while ((line = br.readLine()) != null) {
            String[] userData = line.split(splitBy);
            userPass = userData[1];
        }
        return userPass;
    }


}