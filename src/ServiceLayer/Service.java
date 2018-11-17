package ServiceLayer;
import BuisnessLayer.Buisness;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;


@Path("RestService")
public class Service {
    @Context
    @Path("/company")
    @DELETE
    @QueryParam("text/plain")
    @Produces("application/json")
    public String deleteAll(String companyName) {
        Buisness bl = new Buisness();
        return bl.deleteAllCompany(companyName);
    }

    @Path("/department")
    @GET
    @QueryParam("text/plain")
    @Produces("application/json")
    public String getDepartments(String deptJson) {
        Buisness bl = new Buisness();
        return bl.getDepartmentsByName(deptJson);
    }

    @Path("/departments")
    @GET
    @QueryParam("text/plain")
    @Produces("application/json")
    public String getAllDepartments(String company) {
        Buisness bl = new Buisness();
        return bl.getDepartmentsByCompany(company);
    }

    @Path("/department")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String insertDepartments(String deptJson){
        Buisness bl = new Buisness();
        return bl.insertDepartmentToData(deptJson);
    }

    @Path("department")
    @POST
    @FormParam("application/json")
    @Produces("application/json")
    public String updateDepartment(String deptJson){
        Buisness bl = new Buisness();
        return bl.updateDepartmentToData(deptJson);
    }

    @Path("/department")
    @DELETE
    @QueryParam("text/plain")
    @Produces("application/json")
    public String deleteDepartment(String deptJson){
        Buisness bl = new Buisness();
        return bl.deleteDepartmentFromData(deptJson);
    }

    @Path("/employee")
    @GET
    @QueryParam("text/plain")
    @Produces("application/json")
    public String getEmployee(int emp_id){
        Buisness bl = new Buisness();
        return bl.getEmployeeById(emp_id);
    }

    @Path("/employee")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String getAllEmployees(String company){
        Buisness bl = new Buisness();
        return bl.getAllEmployees(company);
    }

    @Path("/employee")
    @POST
    @FormParam("application/json")
    @Produces("application/json")
    public String insertEmployee(String inJson){
        Buisness bl = new Buisness();
        return bl.insertEmployeeasData(inJson);
    }

    @Path("/employee")
    @DELETE
    @QueryParam("text/plain")
    @Produces("application/json")
    public String updateEmployee(String inJson){
        Buisness bl = new Buisness();
        return bl.updateEmployeeInData(inJson);
    }

    @Path("/timecard")
    @GET
    @QueryParam("text/plain")
    @Produces("application/json")
    public String deleteEmployee(int emp_id){
        Buisness bl = new Buisness();
        return bl.deleteEmployeeInData(emp_id);
    }

    @Path("/timecards")
    @GET
    @QueryParam("text/plain")
    @Produces("application/json")
    public String getTimecard(int timecard_id){
        Buisness bl = new Buisness();
        return bl.getTimecardsInData(timecard_id);
    }

    @Path("/timecards")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public String getAllTimecards(int emp_id){
        Buisness bl = new Buisness();
        return bl.getAllTimecardsInData(emp_id);
    }

    @Path("/timecard")
    @PUT
    @QueryParam("text/plain")
    @Produces("application/json")
    public String insertTimecard(String inJson){
        Buisness bl = new Buisness();
        return bl.insertTimecardInData(inJson);
    }

    @Path("/timecard")
    @POST
    @FormParam("application/json")
    @Produces("application/json")
    public String updateTimecard(String inJson){
        Buisness bl = new Buisness();
        return bl.updateTimecardInData(inJson);
    }

    @Path("/timecard")
    @DELETE
    @QueryParam("text/plain")
    @Produces("application/json")
    public String deleteTimecard(int timecard_id){
        Buisness bl = new Buisness();
        return bl.deleteTimecardfromData(timecard_id);
    }
}