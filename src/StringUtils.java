public class StringUtils {
    /**
     * makePurdueUsername -- <= 8-letter-long lowercase username creator
     * Usernames may be AT MOST 8 letters in length, and should
     * consist of the first letter of one's first name, and the 
     * amount of their last name that will fit into the remaining
     * 7 characters. All should be lowercase.
     * Ex: a = "Sean ", b = "Flannery", returns "sflanner"
     */
    public static String makePurdueUsername(String firstName, String lastName) {
        /* Generate the long version of the name first:
            Ex: firstName = "Sean", lastName = "Flannery"
                    --> res = "SFlannery"
         */
        String res = firstName.substring(0,1) + lastName;
        /* Shorten the string to 8 characters
            Ex: res = "SFlannery"
                    --> res = "SFlanner"
         */
        if (res.length() > 7){
            res = res.substring(0, 8);
        }

        /* Convert the name to lower-case
            Ex: res = "SFlanner"
                    --> res = "sflanner"
         */
        res = res.toLowerCase();
        /* return the result of our calculation */
        return res;
    }

    /**
     * replaceStudentUsername -- replace student usernames in sensitive text
     * We want to make sure student information is expunged from sensitive
     * documents as much as possible. 
     * Ex: text = "jframes was among the students whose SSNs were leaked.",
     * username = "[DATA EXPUNGED] was among the students whose SSNs were leaked.",
     */
    public static String replaceStudentUsername(String text, String username) {
        /* Replace every instance of the username with proper message */
        return text.replaceAll(username, "[DATA EXPUNGED]");
    }
}public class StringUtils {
2
    /**
3
     * makePurdueUsername -- <= 8-letter-long lowercase username creator
4
     * Usernames may be AT MOST 8 letters in length, and should
5
     * consist of the first letter of one's first name, and the 
6
     * amount of their last name that will fit into the remaining
7
     * 7 characters. All should be lowercase.
8
     * Ex: a = "Sean ", b = "Flannery", returns "sflanner"
9
     */
10
    public static String makePurdueUsername(String firstName, String lastName) {
11
        /* Generate the long version of the name first:
12
            Ex: firstName = "Sean", lastName = "Flannery"
13
                    --> res = "SFlannery"
14
         */
15
        String res = firstName.substring(0,1) + lastName;
16
        /* Shorten the string to 8 characters
17
            Ex: res = "SFlannery"
18
                    --> res = "SFlanner"
19
         */
20
        res.substring(0, 8);
21
        /* Convert the name to lower-case
22
            Ex: res = "SFlanner"
23
                    --> res = "sflanner"
24
         */
25
        res.toLowerCase();
26
        /* return the result of our calculation */
27
        return res;
28
    }
29
​
30
    /**
31
     * replaceStudentUsername -- replace student usernames in sensitive text
32
     * We want to make sure student information is expunged from sensitive
33
     * documents as much as possible. 
34
     * Ex: text = "jframes was among the students whose SSNs were leaked.",
35
     * username = "[DATA EXPUNGED] was among the students whose SSNs were leaked.",
36
     */
37
    public static String replaceStudentUsername(String text, String username) {
38
        /* Replace every instance of the username with proper message */
39
        return text.replaceAll(username, "[DATA EXPUNDGED]");
40
    }
41
}
