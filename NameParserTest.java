class NameParser {
    public String parse(String[] names) {
        String result = "";

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            res.append(firstName);
            if (i != names.length - 1) {
                res.append(", ");
            }
        }

        return res.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
