package com.interview;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vivek = { "VIVEK DHIMAN" };

		try {
			for (int i = 0; i < vivek.length; i++) {

				if (vivek[i] == "VIVEK DHIMAN") {
					System.out.println(vivek[i]);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Something Went Wrong " + e);
		}

	}

}
