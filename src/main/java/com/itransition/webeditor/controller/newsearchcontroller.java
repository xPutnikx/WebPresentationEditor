package com.itransition.webeditor.controller;

import org.apache.lucene.queryParser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itransition.webeditor.dao.TagsDao;

@Controller
public class newsearchcontroller {

	@Autowired
	TagsDao tagsDao;
	
		@RequestMapping(value = "newsearch", method = RequestMethod.GET)
		public String home(Model model) throws ParseException{
			return "newsearch";
		}
//		 private static void search(Searcher searcher, String queryString)
//			        throws ParseException, IOException {
//
//			        // Build a Query object
//			        Query query = QueryParser.parse(
//			            queryString, "content", new StandardAnalyzer(null));
//
//			        // Search for the query
//			        Hits hits = searcher.search(query);
//
//			        // Examine the Hits object to see if there were any matches
//			        int hitCount = hits.length();
//			        if (hitCount == 0) {
//			            System.out.println(
//			                "No matches were found for \"" + queryString + "\"");
//			        }
//			        else {
//			            System.out.println("Hits for \"" +
//			                queryString + "\" were found in quotes by:");
//
//			            // Iterate over the Documents in the Hits object
//			            for (int i = 0; i < hitCount; i++) {
//			                Document doc = hits.doc(i);
//
//			                // Print the value that we stored in the "title" field. Note
//			                // that this Field was not indexed, but (unlike the
//			                // "contents" field) was stored verbatim and can be
//			                // retrieved.
//			                System.out.println("  " + (i + 1) + ". " + doc.get("title"));
//			            }
//			        }
//			        System.out.println();
//			    }
	}