package com.cerotid.JavaOOPS.walmartServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cerotid.JavaOOPS.cars.Camaro;
import com.cerotid.JavaOOPS.cars.Sedan;
import com.cerotid.JavaOOPS.cars.Spark;
import com.cerotid.JavaOOPS.walmartService.WalmartOilChangeService;
import com.cerotid.JavaOOPS.walmartService.WalmartRevenue;

class WalmartRevenueTest {

	Sedan sedan = new Sedan();
	Spark spark = new Spark();
	Camaro camaro = new Camaro();

	WalmartRevenue walmartRevenue = new WalmartRevenue();

	@Test
	void sedanRevenueTest() {

		float sedanRevenue = walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(sedan, 2));
		assertEquals(79.98f, sedanRevenue);
	}

	@Test
	void sparkRevenueTest() {

		float sparkRevenue = walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(spark, 2));
		assertEquals(59.98f, sparkRevenue);
	}

	@Test
	void camaroRevenueTest() {

		float camaroRevenue = walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(camaro, 2));
		assertEquals(99.98f, camaroRevenue);
	}

	@Test
	void totalRevenueTest() {
		walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(sedan, 2));
		walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(spark, 2));
		walmartRevenue.oilChangeRevenue(new WalmartOilChangeService(camaro, 2));

		float totalRevenue1 = walmartRevenue.totalRevenue();
		assertEquals(239.94f, totalRevenue1);

	}

}
