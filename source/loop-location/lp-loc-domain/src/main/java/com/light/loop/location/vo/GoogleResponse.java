package com.light.loop.location.vo;
/**
 * 
 * 
 * @author Abhishek Somani
 * 
 */
public class GoogleResponse {
 
 
 private Result[] results ;
 private String status ;
 private Object exclude_from_slo;
 public Result[] getResults() {
  return results;
 }
 public void setResults(Result[] results) {
  this.results = results;
 }
 public String getStatus() {
  return status;
 }
 public void setStatus(String status) {
  this.status = status;
 }
/**
 * @return the exclude_from_slo
 */
public Object getExclude_from_slo() {
	return exclude_from_slo;
}
/**
 * @param exclude_from_slo the exclude_from_slo to set
 */
public void setExclude_from_slo(Object exclude_from_slo) {
	this.exclude_from_slo = exclude_from_slo;
}
 
 

}