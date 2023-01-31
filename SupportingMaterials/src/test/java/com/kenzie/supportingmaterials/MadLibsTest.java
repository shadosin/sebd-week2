package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;

class MadLibsTest {
    @Test
    public void testCaseOne() {
        // Place Food Animal
        String[] args = {"Cyprus Coastline","cheese sticks","tardigrade"};
        MadLibs.madLibs(args);
    }

    @Test
    public void testCaseTwo() {
        // Place Food Animal
        String[] args = {"Oklahoma Prairie in winter","40 artisan crackers","slug"};
        MadLibs.madLibs(args);
    }

    @Test
    public void testCaseThree() {
        // TODO put yours example here
        // Place Food Animal
        String[] args = {"","",""};
        MadLibs.madLibs(args);
    }
}