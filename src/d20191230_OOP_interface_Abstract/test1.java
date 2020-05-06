package d20191230_OOP_interface_Abstract;

public class test1 {
		static int[][] answer = new int[3][3];

		public static void main(String[] args) {

			test1 sol = new test1();
			int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			sol.solution(input);

			System.out.println("===== Output Data =====");
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer[i].length; j++) {
					System.out.print(answer[i][j] + " ");
					if (j == answer[i].length - 1) {
						System.out.println("");
					}
				}
			}
		}

		public int[][] solution(int[][] matrix) {
			int len = matrix.length;

			int xVal[] = new int[len];
			int yVal[] = new int[len];

			for (int i = 0; i < len; i++) {
				int xVal_i = 0;
				int yVal_i = 0;
				for (int j = 0; j < len; j++) {
					xVal_i += matrix[i][j];
					yVal_i += matrix[j][i];
				}
				xVal[i] = xVal_i;
				yVal[i] = yVal_i;
			}

			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					answer[i][j] = xVal[i] + yVal[j] - matrix[i][j];
				}
			}
			return answer;
		}
	}


