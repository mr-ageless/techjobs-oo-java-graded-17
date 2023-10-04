package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

public class JobTest {
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

    assertNotEquals(job, job1);
}

}
