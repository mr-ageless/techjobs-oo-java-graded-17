package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.System;
import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

public class JobTest {

    private static String lineSeparator() {

        return System.lineSeparator();
    }

    //TODO: Create your unit tests here

@Test
public void testSettingJobId() {
    // Added two instances of the Job class to be tested
    Job job1 = new Job();
    Job job2 = new Job();
    // Checks that each job item is being assigned a unique id
    assertNotEquals(job1.getId(), job2.getId());
}

@Test
    public void testJobConstructorSetsAllFields() {
    //
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    // These asserts test that the information being supplied to the job fields is correct.
    // True checks that the object is an instance of the proper class.
    // Equals checks that the information is of the proper value for that field.
    assertTrue(job.getName() instanceof String);
    assertEquals("Product tester", job.getName());

    assertTrue(job.getEmployer() instanceof Employer);
    assertEquals("ACME", job.getEmployer().getValue());

    assertTrue(job.getLocation() instanceof Location);
    assertEquals("Desert", job.getLocation().getValue());

    assertTrue(job.getPositionType() instanceof PositionType);
    assertEquals("Quality control", job.getPositionType().getValue());

    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", job.getCoreCompetency().getValue());
}

@Test
    public void testJobsForEquality() {
    //Two identical instances of job, with different ids supplied by the id incrementer in Job.java
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    // Asserts that job and job1 are not equal. All fields are the same except their id, so they are not equal.
    assertNotEquals(job, job1);
}

@Test
    public void testToStringStartsAndEndsWithNewLine() {
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String jobString = job.toString();

    assertTrue(jobString.startsWith(lineSeparator()));
    assertTrue(jobString.endsWith(lineSeparator()));
}

@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String jobString = job.toString();

    assertTrue(jobString.contains("ID: " + job.getId() + lineSeparator()));
    assertTrue(jobString.contains("Name: Product tester" + lineSeparator()));
    assertTrue(jobString.contains("Employer: ACME" + lineSeparator()));
    assertTrue(jobString.contains("Location: Desert" + lineSeparator()));
    assertTrue(jobString.contains("Position Type: Quality control" + lineSeparator()));
    assertTrue(jobString.contains("Core Competency: Persistence" + lineSeparator()));
}

 @Test
    public void testToStringHandlesEmptyField() {

    Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    String jobString = job.toString();

    String expectedFormat = lineSeparator() + "ID: " + job.getId() + lineSeparator() + "Name: Data not available" + lineSeparator() + "Employer: Data not available" + lineSeparator() + "Location: Data not available" + lineSeparator() + "Position Type: Data not available" + lineSeparator() + "Core Competency: Data not available" + lineSeparator();

    assertEquals(expectedFormat, jobString);
}


}
