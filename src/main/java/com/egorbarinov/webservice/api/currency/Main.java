package com.egorbarinov.webservice.api.currency;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.*;
import javax.xml.bind.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(ValCurs.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        URL url = new URL("https://www.cbr.ru/scripts/XML_daily.asp?date_req=06/05/2021");
        ValCurs valCurs = (ValCurs) unmarshaller.unmarshal(url);
//        initDB(valCurs);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(valCurs, System.out);

    }
//
//    public static void initDB(ValCurs valCurs) {
//        SessionFactory factory = new Configuration()
//                .configure("configs/hibernate.cfg.xml")
//                .buildSessionFactory();
//
//        Session session = null;
//        try {
//            System.out.println("============\n== CREATE ==\n============");
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(valCurs);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            if (session != null) {
//                session.close();
//            }
//        }
//    }


}
