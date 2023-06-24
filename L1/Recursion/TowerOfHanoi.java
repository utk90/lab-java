package Recursion;

public class TowerOfHanoi {
    // moves: 2^N-1
    // time: O(2^N)
    // space: O(N)
    public long toh(int N, int from, int to, int aux) {
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return 1;
        } else {
            // move (N-1) disks from A to B using C
            long st1 = toh(N - 1, from, aux, to);
            // move Nth disk to C
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            long st2 = 1;
            // move (N-1) disks from B to C using A
            long st3 = toh(N - 1, aux, to, from);

            return st1 + st2 + st3;
        }
    }
}
