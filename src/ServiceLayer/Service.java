package ServiceLayer;
import BuisnessLayer.Buisness;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;


@Path("CompanyServices")
public class Service {
    @Context
    @Path("/company")
    @DELETE
    @Produces("application/json")
    public String deleteAll(@QueryParam("company") String companyName) {
        Buisness bl = new Buisness();
        return bl.deleteAllCompany(companyName);
    }

    @Path("/department")
    @GET
    @Produces("application/json")
    public String getDepartments(@QueryParam("company") String deptJson) {
        Buisness bl = new Buisness();
        return bl.getDepartmentsByName(deptJson);
    }

    @Path("/departments")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public String getAllDepartments(@QueryParam("company") String company) {
        Buisness bl = new Buisness();
        return bl.getDepartmentsByCompany(company);
    }

    @Path("/department")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String insertDepartments(@FormParam("department") String deptJson){
        Buisness bl = new Buisness();
        return bl.insertDepartmentToData(deptJson);
    }

    @Path("department")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String updateDepartment(@FormParam("department") String deptJson){
        Buisness bl = new Buisness();
        return bl.updateDepartmentToData(deptJson);
    }

    @Path("/department")
    @DELETE
    @Consumes("application/json")
    @Produces("application/json")
    public String deleteDepartment(@FormParam("department") String deptJson){
        Buisness bl = new Buisness();
        return bl.deleteDepartmentFromData(deptJson);
    }

    @Path("/employee")
    @GET
    @Produces("application/json")
    public String getEmployee(@QueryParam("emp_id") int emp_id){
        Buisness bl = new Buisness();
        return bl.getEmployeeById(emp_id);
    }

    @Path("/employees")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public String getAllEmployees(@QueryParam("company") String company){
        Buisness bl = new Buisness();
        return bl.getAllEmployees(company);
    }

    @Path("/employee")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String insertEmployee(@QueryParam("employee") String inJson){
        Buisness bl = new Buisness();
        return bl.insertEmployeeasData(inJson);
    }

    @Path("/employee")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String updateEmployee(@FormParam("employee") String inJson){
        Buisness bl = new Buisness();
        return bl.updateEmployeeInData(inJson);
    }

    @Path("/employee")
    @DELETE
    @Produces("application/json")
    public String deleteEmployee(@QueryParam("emp_id") int emp_id){
        Buisness bl = new Buisness();
        return bl.deleteEmployeeInData(emp_id);
    }

    @Path("/timecard")
    @GET
    @Produces("application/json")
    public String getTimecard(@QueryParam("timecard_id") int timecard_id){
        Buisness bl = new Buisness();
        return bl.getTimecardsInData(timecard_id);
    }

    @Path("/timecards")
    @GET
    @Produces("application/json")
    public String getAllTimecards(@QueryParam("emp_id") int emp_id){
        Buisness bl = new Buisness();
        return bl.getAllTimecardsInData(emp_id);
    }

    @Path("/timecard")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String insertTimecard(@FormParam("timecard") String inJson){
        Buisness bl = new Buisness();
        return bl.insertTimecardInData(inJson);
    }

    @Path("/timecard")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String updateTimecard(@FormParam("timecard") String inJson){
        Buisness bl = new Buisness();
        return bl.updateTimecardInData(inJson);
    }

    @Path("/timecard")
    @DELETE
    @Produces("application/json")
    public String deleteTimecard(@QueryParam("timecard_id") int timecard_id){
        Buisness bl = new Buisness();
        return bl.deleteTimecardfromData(timecard_id);
    }
}