define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "0|1|ABSTOL|AC|AD|AF|AM|AREA|AS|B|BADMOS3|BETA|BF|BR|BV|C|CBD|CBS|CGBO|CGD|CGDO|CGS|CGSO|CHGTOL|CJ|CJC|CJE|CJO|CJS|CJSW|CSW|D|DC|DEC|DEFAD|DEFAS|DEFL|DEFW|EG|EXP|Euler|FC|GAMMA|GMIN|Gear|I|IBV|IC|IDB|IH|II|IKF|IKR|IM|IP|IR|IRB|IS|ISC|ISE|IT|ITF|ITL1|ITL2|ITL3|ITL4|ITL5|JS|KEEPOPINFO|KF|KP|L|LAMBDA|LD|LEVEL|LIN|M|METHOD|MJ|MJC|MJE|MJS|MJSW|N|NARROW|NC|NE|NF|NFS|NJF|NMOS|NOISE|NPN|NR|NRD|NRS|NSS|NSUB|OCT|OFF|ON|PB|PD|PHI|PIVREL|PJF|PMOS|PNP|PS|PTF|PULSE|PWL|R|RB|RBM|RC|RD|RE|RELTOL|ROFF|RON|RS|RSH|SFFM|SIN|SW|TC1|TC2|TEMP|TF|TNOM|TOX|TPG|TR|TRAN|TRTOL|TT|Trapezoidal|U0|UIC|UO|V|VAF|VAR|VDB|VH|VI|VJ|VJC|VJE|VJS|VM|VNTOL|VP|VR|VT|VT0|VTF|VTO|W|XCJC|XJ|XTB|XTF|XTI";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[(]"},
				{token: "rparen", regex: "[)]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/cir";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
