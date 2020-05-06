package d20191223_Arr;

public class Java_Array_신한1223 {
	
	public static void main(String[] args) {
		
		/* 1번 문제
		int[][] score = {
				{80, 80, 80, 0, 0},
				{60, 50, 80, 0, 0},
				{50, 90, 90, 0, 0},
				{40, 50 ,60, 0, 0},
				{90, 90, 95, 0, 0},
				{85, 95, 100, 0, 0}};
		
		// 총점과 평균
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0, avg = 0;
			for(int j = 0; j < score[i].length; j++) {
				if(j < score[i].length-2) {
					sum += score[i][j];
				}else if (j == score[i].length-2)  {
					avg = sum/3;
					score[i][j] = sum;
				}else 
					score[i][j] = avg;
				
				
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		*/
		/*
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 3; j++) {
					score[i][3] += score[i][j];
					score[i][4] = score[i][3]/3;
				}
			}
			
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print("score[i][j]");
				}
			}
		*/
		/* 2~3번 문제
		// 버블 정렬
		int[] data = {100, 20, 5, 2, 3, 34, 65, 23, 66, 200};
		
		int temp;
		
		for(int j = 0; j < data.length-1; j++) {
			
			for(int i = 0; i < data.length-1-j; i++) {
				if(data[i] > data[i+1]) {
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
				
				
			}
			
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		
		
		*/
		
		/* 2~3번 문제
		// 삽입 정렬
		int[] data = {100, 20, 5, 2, 3, 34, 65, 23, 66, 200};
		
		int key, j;
		
		
		for(int i = 1; i < data.length; i++) {		// 0은 정렬되어있다고 생각
			key = data[i];
			
			for(j = i-1; j >= 0 && data[j] > key; j--) {
				data[j+1] = data[j];
				
				
			}
			
			data[j+1] = key;
			
		}
		
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		
		*/
		
		/* 2~3번 문제
		// 선택 정렬
		int[] data = {100, 20, 5, 2, 3, 34, 65, 23, 66, 200};
		
		int temp, least;
		
		for(int i = 0; i < data.length; i++) {
			least = i;
			for(int j = i+1; j < data.length; j++) {
				
				if(data[least] > data[j]) {
					least = j;
				}
				if(i != least) {
					
					temp = data[i];			
					data[i] = data[least];
					data[least] = temp;
				}
			}
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			
		}
		 */
		
		
		/* 4번 문제
		int money = 2680;
		int i = 0;
		
		int arr[] = new int[4];
		
		while(i <= arr.length) {
			while(true) {
				if(money >= 500) {
					money -= 500;
					arr[i]++;
				}else break;
			}i++;
			
			while(true) {
				if(money >= 100) {
					money -= 100;
					arr[i]++;
				}else break;
			}i++;
			
			while(true) {
				if(money >= 50) {
					money -= 50;
					arr[i]++;
				}else break;
			}i++;
			
			while(true) {
				if(money >= 10) {
					money -= 10;
					arr[i]++;
					
				}else break;
			}i++;	
		}
		
		System.out.println("500원 개수 : " + arr[0]);
		System.out.println("100원 개수 : " + arr[1]);
		System.out.println("50원 개수 : " + arr[2]);
		System.out.println("10원 개수 : " + arr[3]);
			
		*/
		
		/*
		int money = 2680;
	      int[] coin = {500, 100, 50, 10};
	      
	      System.out.println("투입된 돈 : " + money);
	      
	      for(int i = 0; i < coin.length; i++)  {
	    	  System.out.println("거스름돈 : " + coin[i] + " 원권  : " + money/coin[i]);
	    	  money %=coin[i];
	      }
		*/
		
		
		///* 5번 문제
		int[] ans = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2}; // answer 배열
		char ch = '*';
		
		for(int i = 0; i < ans.length; i++) {
			
			for(int j = 1; j <= ans[i]; j++) {
				System.out.print(ch);
			}	
			
			System.out.println("\t" + ans[i]);		
		}
		
		//*/
		
		/* 6번 문제
		int[][] score = {
	            {100, 100, 100},
	            {20, 20, 20},
	            {30, 30, 30},
	            {40, 40, 40},
	            {50, 50, 50}};
	      
	      int[][] arr = new int[6][4];
	      
	      for(int row = 0; row < score.length; row++) {      // row(행)가 0부터 4까지 반복
	         
	         for(int col = 0; col < score[row].length; col++) {      // col(열)이 0부터 2까지 1씩 증가하면서 반복
	            
	            arr[row][col] = score[row][col];      // 배열 arr에 score 배열을 대입
	            arr[row][3] += score[row][col];         // arr는 score보다 행과 열이 한칸씩 크고 각 행의 합을 넣어야 함
	                                          // 매 행의 3열에 score의 매 행의 수를 더함
	            System.out.print(arr[row][col] + "\t");   // 출력
	         }
	         
	         System.out.print(arr[row][3]);            // arr배열의 3열 출력
	         System.out.println();
	         
	      }
	      for(int j = 0; j < 4; j ++) {         // j가 0부터 4까지 1씩 증가 // 왜? 여기서 j는 열을 뜻함 열이 0 1 2 3 까지 있기 때문
	         
	         for(int i = 0; i < score.length; i ++) {      // i가 0부터 score배열의 크기까지 1씩 증가
	            arr[5][j] += arr[i][j];         // arr배열의 5행에 각 열의 합을 넣어야 함
	                  
	         }
	         System.out.print(arr[5][j] + "\t");   // arr배열 5행 출력
	         
	      }
		
		*/
	}

}
