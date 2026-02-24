
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinsException extends Exception {
    public MinsException(String message) {
        super(message);
    }
}

class SecsException extends Exception {
    public SecsException(String message) {
        super(message);
    }
}

class time {
    int hour;
    int minute;
    int second;

    time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void display() throws HrsException, MinsException, SecsException {
        if (hour < 0 || hour > 23) {
            throw new HrsException("Invalid hours: ");
        }
        if (minute < 0 || minute > 59) {
            throw new MinsException("Invalid minutes: ");
        }
        if (second < 0 || second > 59) {
            throw new SecsException("Invalid seconds: ");
        }

    }
}

public class lab6_4 {
    public static void main(String[] args) {
        time t = new time(25, 61, 61);
        try {
            t.display();
        } catch (HrsException | MinsException | SecsException e) {
            System.out.println(e);
        }
    }
}
