package dhruv.src;

class Cookie {
    public int chocChipNum;
    public int cookieDiameter;

    public Cookie(int chocChipNum, int cookieDiameter) {
        this.chocChipNum = chocChipNum;
        this.cookieDiameter = cookieDiameter;
    }

    public String toString() {
        return ("Used " + chocChipNum "chocoloate chips to make a cookie with a diameter of " + cookieDiameter);
    }

    class mnmCookie extends Cookie {
        public int mnmCount;

        public mnmCookie(int chocChipNum, int cookieDiameter, int StartmnmCount) {
            super(chocChipNum, cookieDiameter);
            mnmCount = StartmnmCount;
        }

        public void addMnm(int addNum) {
            mnmCount = mnmCount + addNum;
        }

        @java.lang.Override
        public String toString() {
            return (super.toString() + "number of MnM's used was " + mnmCount);
        }
    }

    public class makeCookie {
        public static void main(String args[]) {
            mnmCookie cookie = new mnmCookie(10, 5, 6);
            System.out.println(cookie.toString());
        }
    }
}