//Tests the one-line comment commenting out the start of a multi-line comment
class CommentClass {
    public int add(int a, int b) {
        //return a + b;
        if ((a + b) < (a * b)) {
            ///*
            if (a < b) {
                System.out.println(a == b);
            } else {
                System.out.println(false);
            }
            */
            a = a + b;
        }
        return a;
        //return a+b;
    }
}
