package com.example.cma;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

/** 
* IntermediateChecksRecordController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 29, 2019</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes=CmaApplication.class)

public class IntermediateChecksRecordControllerTest { 

    //private MockMvc mockMvc;
    @Autowired
    private com.example.cma.RecordRepository recordRepository;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getAllRecord(HttpServletRequest request, HttpServletResponse response) 
* 
*/ 
@Test
public void testGetAllRecord() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getOneByRecordId(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="recordId",required=false)Long recordId) 
* 
*/ 
@Test
public void testGetOneByRecordId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addRecord(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "planId", required = false) Long planId, @RequestParam(value = "object", required = false) String object, @RequestParam(value = "checkDate", required = false) Date checkDate, @RequestParam(value = "processRecord", required = false) String processRecord, @RequestParam(value = "processRecordPerson", required = false) String processRecordPerson, @RequestParam(value = "processRecordDate", required = false) Date processRecordDate, @RequestParam(value = "resultRecord", required = false) String resultRecord, @RequestParam(value = "resultRecordPerson", required = false) String resultRecordPerson, @RequestParam(value = "resultRecordDate", required = false) Date resultRecordDate, @RequestParam(value = "note", required = false) String note) 
* 
*/ 
@Test
@Transactional
public void testAddRecord() throws Exception { 
//TODO: Test goes here...
    com.example.cma.IntermediateChecksRecord record=new com.example.cma.IntermediateChecksRecord();
    String date1="2019-5-30";
    String date2="2019-6-3";
    String date3="2019-6-6";
    Date d1=Date.valueOf(date1);
    Date d2=Date.valueOf(date2);
    Date d3=Date.valueOf(date3);
    record.setplanID(8);
    record.setObject("testObj");
    record.setDate(d1);
    record.setProcessRecord("testProRec");
    record.setProcessRecordPerson("testProcessRecordPerson");
    record.setProcessRecordDate(d2);
    record.setResultRecord("testResultRecord");
    record.setResultRecordPerson("testResultRecordPerson");
    record.setResultRecordDate(d3);
    record.setNote("testNote");
    recordRepository.save(record);
    System.out.println(("recordId:"+record.getrecordId()));
    Assert.assertTrue(record.getrecordId()>=0);
} 

/** 
* 
* Method: deleteRecord(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="recordId",required=false)Long recordId) 
* 
*/ 
@Test
public void testDeleteRecord() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: modifyRecord(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="recordId",required=false)Long recordId, @RequestParam(value = "planId", required = false) Long planId, @RequestParam(value = "object", required = false) String object, @RequestParam(value = "checkDate", required = false) Date checkDate, @RequestParam(value = "processRecord", required = false) String processRecord, @RequestParam(value = "processRecordPerson", required = false) String processRecordPerson, @RequestParam(value = "processRecordDate", required = false) Date processRecordDate, @RequestParam(value = "resultRecord", required = false) String resultRecord, @RequestParam(value = "resultRecordPerson", required = false) String resultRecordPerson, @RequestParam(value = "resultRecordDate", required = false) Date resultRecordDate, @RequestParam(value = "note", required = false) String note) 
* 
*/ 
@Test
public void testModifyRecord() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getOneByPlanId(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="planId",required=false)Long planId) 
* 
*/ 
@Test
public void testGetOneByPlanId() throws Exception { 
//TODO: Test goes here... 
} 


} 
