package com.appdynamics;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    public static void main0(String[] args) {
        System.out.println((char)67);
    }
    public static void main1(String[] args) throws IOException {
        URL url = new URL("http://www.google.com");
        URLConnection urlConnection = url.openConnection();
        System.out.println(urlConnection.getURL().getPath().split("/")[0]);

        File dir = new File("/Users/abey.tom/.loganalyzer/zendesk/13374/(3)August 02 2013 14.50");
        float f = 92739368;


        HashMap hashMap = new HashMap();
        hashMap.put("a","b");
        hashMap.put("d","c");

        String path = dir.getAbsolutePath();
        Process process = Runtime.getRuntime().exec(new String[]{"open", "-a", "Finder", path});
        InputStream in = process.getErrorStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
    }

    public static void main2(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            sb.append(" -Dfile" + i + "=/path/in/my/macos/to/file" + i);
        }
        System.out.println(sb.toString());
    }

    public static void main4(String[] args) throws IOException, URISyntaxException {
//        URL url1 = new URL("file:/Users/abey.tom/temp/folder%20with%20space");
//        String file = url1.getFile();
//        String decode = URLDecoder.decode(file,"utf-8");
//        System.out.println(new File(decode).getAbsolutePath());
//
//        BASE64Encoder base64Encoder = new BASE64Encoder();
//        String encode = base64Encoder.encode("admin:welcome".getBytes());
//        System.out.println(encode);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss Z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println( simpleDateFormat.format(new Date()));


    }

    public static void main3(String[] args) {
//        String pwd = Decrypt("B661C178A1ECA18BBBD1");
//        System.out.println(pwd);
        System.out.println(new Date(1389727080000L));
    }

    private static String Decrypt(String Pwd) {
        String key = "8459F04895D495B382E1944A5016D486FAD240CCD37";
        String unXorBuf = "";
        String unHexBuf = "";
        try {
            for (int Ind = 0; Ind < Pwd.length(); Ind++) {
                unXorBuf = unXorBuf + Integer.toHexString(Integer.parseInt(Pwd.substring(Ind, Ind + 1), 16) ^ Integer.parseInt(key.substring(Ind, Ind + 1), 16));
            }

            for (int Ind = 0; Ind < unXorBuf.length(); Ind += 2) {
                unHexBuf = unHexBuf + (char) Integer.parseInt(unXorBuf.substring(Ind, Ind + 2), 16);
            }

            return unHexBuf;
        } catch (Exception ex) {
        }
        return Pwd;
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    private static String round(String s) {
        if (s != null && !s.trim().isEmpty()) {
            try {
                return new BigDecimal(s.trim()).setScale(0, RoundingMode.HALF_UP).toString();
            } catch (Exception e) {

            }
        }
        return null;
    }

    public static void main5(String[] args) {
        System.out.println(((int)'z'));
//        Pattern compile = Pattern.compile("@*(.+?):*");
//        Matcher matcher1 = compile.matcher("localhost:1521");
//        if(matcher1.find()){
//            System.out.println(matcher1.group(1));
//        }
//        Matcher matcher2 = compile.matcher("jdbc@localhost:1521");
//        if(matcher2.find()){
//            System.out.println(matcher2.group(1));
//        }
//        Matcher matcher3 = compile.matcher("jdbc@localhost:1521/xe");
//        if(matcher3.find()){
//            System.out.println(matcher3.group(1));
//        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/abey.tom/cstools/loganalyzer/zendesk/34648/April-29-2015_13.54.16/appagent-log.tar/logs/gblweb998.thehut.local/agent.2015_04_29__16_11_43.0.log"));
        String temp;
        int count = 0;
        while ((temp = br.readLine()) != null) {
            if(count++ == 2141){
                System.out.println(temp);
                System.out.println(br.readLine());
                break;
            }
        }
        br.close();
    }
}
