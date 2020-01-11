package com.testing.maven.vip05junitmaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class PlusTest {
	private static Plus pls;
     private static int expectedresult;
     private static int x;
     private static int y;
     
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("-------------����������������֮ǰ����-------------------");
		pls=new Plus();
	}

	public PlusTest(String casename,int expected,int frist,int second) {
		expectedresult=expected;
		x=frist;
		y=second;
	}

	@Test
	public void test() {
		int he=pls.Sum(x, y);
		System.out.println(he);
		assertEquals(expectedresult,he);
	}
	@Parameters(name="{0}")
	public static Object[][] PlusData(){
		return new Object[][] {
			{"һ",2,1,1},
			{"��",4,2,2},
			{"��",8,4,4}
		};
		
	}
	

}
