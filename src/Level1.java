import java.util.Arrays;

public class Level1 {
    public static String Keymaker (int k) {
        int[] doors = new int[k];

        for (int i = 0; i < k; i++) {
            doors[i] = 0;
        }

        for (int i = 0; i < k; i++) {
            if (i == 0) stepOne(doors);
            else if (i == 1) stepTwo(doors);
            else if (i == 2) stepThree(doors);
            else moreThanThree(doors, i);
        }

        StringBuilder openCloseDoor = new StringBuilder();
        for (int x = 0; x < k; x++) {
            openCloseDoor.append(doors[x]);
        }

        return openCloseDoor.toString();
    }
    public static int[] stepOne (int[] doors) {
        for (int x = 0; x < doors.length; x++) {
            doors[x] = 1;
        }
        return doors;
    }
    public static int[] stepTwo (int[] doors) {
        for (int x = 1; x < doors.length; x += 2) {
            doors[x] = 0;
        }
        return doors;
    }
    public static int[] stepThree (int[] doors) {
        for (int x = 2; x < doors.length; x += 3) {
            if (doors[x] == 1) {
                doors[x] = 0;
            }
            else doors[x] = 1;
        }
        return doors;
    }
    public static int[] moreThanThree (int[] doors, int i) {
        if (doors[i] == 1) {
            doors[i] = 0;
        }
        else doors[i] = 1;

        return doors;
    }
}

