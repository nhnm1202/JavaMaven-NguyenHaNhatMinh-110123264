package com.nguyenhanhatminh;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPhuongTrinhCoMotNghiem() {
        assertEquals("x = 2.0", App.giaiPhuongTrinhBac1(2, -4));
    }

    @Test
    public void testPhuongTrinhVoSoNghiem() {
        assertEquals("VO_SO_NGHIEM", App.giaiPhuongTrinhBac1(0, 0));
    }

    @Test
    public void testPhuongTrinhVoNghiem() {
        assertEquals("VO_NGHIEM", App.giaiPhuongTrinhBac1(0, 5));
    }
}
