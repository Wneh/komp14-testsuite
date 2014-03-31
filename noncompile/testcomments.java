//Tests the double ending of a multiline comment.
class CommentClass {
    public int add(int a, int b) {
        //return a + b;
        if ((a + b) < (a * b)) {
            /*
            if(a < b) {
                System.out.println(a == b);
            } else {
                System.out.println(false);
                */
        }
        */
        a = a + b;
    }
    return a;
    //return a+b;
}
}
