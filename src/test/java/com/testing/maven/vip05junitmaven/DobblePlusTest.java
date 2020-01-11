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
public class DobblePlusTest {
	private static Plus ll;
	private static double dx;
	private static double dy;
	private static double dd;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("------------����������������֮ǰ����----------");
		ll=new Plus();
	}
    public DobblePlusTest(String Casaname,double expect,double frist,double second){
	dd=expect;
	dx=frist;
	dy=second;
}
	
	@Test
	public void test() {
		double he=ll.Sum(dx, dy);
		System.out.println(he);
		assertEquals(dd+"",he+"");
	}
	@Parameters(name= "{0}")
	public static Object[][] doubbleAA(){
		return new Object[][] {
			{"�ӷ�һ",5.5,2.5,3.0},
			{"�ӷ���",6.0,2.5,3.5},
			{"�ӷ���",6.4,2.5,3.9}
		};
	}

}
