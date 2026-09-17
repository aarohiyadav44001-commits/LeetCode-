class Solution {
    public int singleNonDuplicate(int[] A) {
        int n = A.length;

        // Base case: if array has only one element
        if (n == 1) return A[0];

        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            // Check boundary conditions first
            if (mid == 0) {
                if (A[0] != A[1]) return A[mid];
            } else if (mid == n - 1) {
                if (A[n - 1] != A[n - 2]) return A[mid];
            } 
            // Check if the current element is the single element
            else if (A[mid - 1] != A[mid] && A[mid] != A[mid + 1]) {
                return A[mid];
            }

            // Binary search logic based on even/odd indexing
            if (mid % 2 == 0) { // Even index
                if (A[mid - 1] == A[mid]) { // First instance was at mid-1, search left
                    end = mid - 1;
                } else { // First instance is at mid, search right
                    st = mid + 1;
                }
            } else { // Odd index
                if (A[mid - 1] == A[mid]) { // First instance was at mid-1 (even index), search right
                    st = mid + 1;
                } else { // Search left
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
