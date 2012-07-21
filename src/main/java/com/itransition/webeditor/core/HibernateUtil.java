package com.itransition.webeditor.core;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
		private static final SessionFactory sessionFactory;

		static {
		 try {
		AnnotationConfiguration conf = new AnnotationConfiguration();
		  sessionFactory = conf.configure().buildSessionFactory();
		 } catch (Throwable ex) {
		  throw new ExceptionInInitializerError(ex);
		 }
		}

		public static Session getSession() throws HibernateException {
		 return sessionFactory.openSession();
		}
		}
